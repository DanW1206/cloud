package com.example.watcher;

import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardWatchEventKinds;
import java.nio.file.WatchEvent;
import java.nio.file.WatchKey;
import java.nio.file.WatchService;

import javax.management.RuntimeErrorException;

// Watch service implementation
public class FolderWatcher {
    private WatchService watchService;
    private final Path directory = Paths.get("testFolder");
    WatchKey watchKey;

public FolderWatcher() throws IOException {
    this.watchService = FileSystems.getDefault().newWatchService();
    this.watchKey = directory.register(watchService, StandardWatchEventKinds.ENTRY_CREATE,StandardWatchEventKinds.ENTRY_DELETE, StandardWatchEventKinds.ENTRY_MODIFY, StandardWatchEventKinds.OVERFLOW);
}
public void watching() throws InterruptedException{
while ((watchKey = watchService.take()) != null) {
            for (WatchEvent<?> event : watchKey.pollEvents()) {
                System.out.println(
                  "Event kind:" + event.kind() 
                    + ". File affected: " + event.context() + ".");
            }
            watchKey.reset();
        }
}
  





      
}





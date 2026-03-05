package com.example;

import java.io.IOException;

import com.example.watcher.FolderWatcher;

public class App {
    public static void main(String[] args) {
    
try {
    FolderWatcher folderWatcher = new FolderWatcher(); 
    folderWatcher.watching();
} catch(IOException | InterruptedException e){
    throw new RuntimeException("IOexception", e);
}
       
      

    }
}



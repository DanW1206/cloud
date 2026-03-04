package com.example;

import java.io.IOException;

import com.example.watcher.FolderWatcher;

public class App {
    public static void main(String[] args) {
         System.out.println("Hello, world!"); 
try {
    FolderWatcher folderWatcher = new FolderWatcher(); 
} catch(IOException e){
    throw new RuntimeException("IOexception", e);
}
       
      

    }
}



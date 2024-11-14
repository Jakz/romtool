package com.jakz.romtool;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FileType
{
  String name;
  String description;
  
  List<FileExtension> extensions;
  
  FileType(String name, String description, FileExtension... extensions)
  {
    this.name = name;
    this.description = description;
    this.extensions = new ArrayList<>(Arrays.asList(extensions));
  }
  
  String name() { return name; }
  String description() { return description; }
  List<FileExtension> extensions() { return extensions; }
  
  
}

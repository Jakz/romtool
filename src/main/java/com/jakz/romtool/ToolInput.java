package com.jakz.romtool;

public class ToolInput
{
  boolean mandatory;
  FileType type;
  
  public ToolInput(FileType type, boolean mandatory)
  {
    this.type = type;
    this.mandatory = mandatory;
  }
}

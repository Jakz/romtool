package com.jakz.romtool;

public class Main
{
  
  
  public static void main(String[] args)
  {
    FileType cso = new FileType("cso", "", new FileExtension("cso"));
    FileType iso = new FileType("iso", "", new FileExtension("iso"));
    
    Tool maxcso = new Tool("maxcso");
    ToolFlow flow = new ToolFlow();
    flow.input.add(new ToolInput(iso, true));
    flow.output.add(new ToolOutput(cso));

  }
}

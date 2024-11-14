package com.jakz.romtool;

import java.util.ArrayList;
import java.util.List;

public class Tool
{
  final String name;
  final List<ToolFlow> flows;

   
  public Tool(String name)
  {
    this.name = name;
    this.flows = new ArrayList<>();
  }
  
  
  public String name() { return name; }
}

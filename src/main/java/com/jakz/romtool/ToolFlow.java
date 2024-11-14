package com.jakz.romtool;

import java.util.ArrayList;
import java.util.List;

public class ToolFlow
{
  final List<ToolInput> input;
  final List<ToolOutput> output;
  
  public ToolFlow()
  {
    this.input = new ArrayList<>();
    this.output = new ArrayList<>();
  }
}

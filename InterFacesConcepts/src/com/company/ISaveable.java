package com.company;

import java.util.ArrayList;
import java.util.List;

public interface ISaveable {
    ArrayList<String> write = new ArrayList<String>();
    public List<String> write();
    public void read(List<String> Arr);
}

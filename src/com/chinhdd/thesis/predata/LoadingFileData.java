package com.chinhdd.thesis.predata;

import com.chinhdd.thesis.ForexException;
import com.chinhdd.thesis.datadefine.DataProperty;

public interface LoadingFileData {

    public boolean startLoadingFileData(String fileName, DataProperty property) throws ForexException;
    public boolean isAvailable();
    public int loadData() throws ForexException;
}

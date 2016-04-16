package com.chinhdd.thesis.predata;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

import com.chinhdd.thesis.ForexException;
import com.chinhdd.thesis.datadefine.DataProperty;

public class ForexLoadingData implements LoadingFileData {
    
    private BufferedReader mBufferReader = null;

    public boolean startLoadingFileData(String fileName,
            DataProperty property) throws ForexException {
        BufferedReader bufferReader = null;
        try {
            bufferReader = new BufferedReader(new FileReader(fileName));
            mBufferReader = bufferReader;
        } catch (FileNotFoundException e) {
            throw new ForexException(e, "Can not start loading file");
        }
        return false;
    }

    public boolean isAvailable() {
        // TODO Auto-generated method stub
        return false;
    }

    public int loadData() throws ForexException {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public void nextItem() throws ForexException {
        // TODO Auto-generated method stub
        
    }

}

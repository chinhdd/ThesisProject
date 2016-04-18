package com.chinhdd.thesis.predata;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.Date;

import com.chinhdd.thesis.datadefine.DataProperty;
import com.chinhdd.thesis.datadefine.DotInteger;
import com.chinhdd.thesis.datadefine.ItemData;
import com.chinhdd.thesis.util.Utils;

public class ItemDataExtract implements ItemDataFetching {

    private BufferedReader mBufferReader;
    private DataProperty mDataProperty;

    public ItemDataExtract(BufferedReader br, DataProperty property) {
        mBufferReader = br;
        mDataProperty = property;
    }

    @Override
    public Date readDateTime() throws IOException {
        try {
            String line = mBufferReader.readLine();
            if (line.startsWith(ItemData.TEXT_DATE)) {
                String strDate = line.substring(ItemData.TEXT_DATE
                        .length() + 1);
                return Utils.getDateTime(strDate);
            } else {
                throw new IOException();
            }
        } catch (Exception e) {
            throw new IOException();
        }
    }

    @Override
    public double getSMA() throws IOException {
        if (mDataProperty == null) {
            throw new IOException();
        }
        if (mDataProperty.includeSMA == false) {
            return 0;
        }
        String line = mBufferReader.readLine();
        if (line.startsWith(ItemData.TEXT_SMA)) {
            String strSMA = line
                    .substring(ItemData.TEXT_SMA.length() + 1);
            return Utils.getDoubleValue(strSMA);
        } else {
            throw new IOException();
        }        
    }

    @Override
    public double getEMA() throws IOException {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public DotInteger getOpenData() throws IOException {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public DotInteger getCloseData() throws IOException {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public DotInteger getHighData() throws IOException {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public DotInteger getLowData() throws IOException {
        // TODO Auto-generated method stub
        return null;
    }
}

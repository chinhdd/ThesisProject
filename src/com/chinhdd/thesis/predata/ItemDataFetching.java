package com.chinhdd.thesis.predata;

import java.io.IOException;
import java.util.Date;

import com.chinhdd.thesis.datadefine.DotInteger;

public interface ItemDataFetching {

    public Date readDateTime() throws IOException;
    public double getSMA() throws IOException;
    public double getEMA() throws IOException;
    public DotInteger getOpenData() throws IOException;
    public DotInteger getCloseData() throws IOException;
    public DotInteger getHighData() throws IOException;
    public DotInteger getLowData() throws IOException;
}

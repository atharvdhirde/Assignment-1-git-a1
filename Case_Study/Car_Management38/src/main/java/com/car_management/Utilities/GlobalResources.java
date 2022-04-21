package com.car_management.Utilities;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class GlobalResources {

    public static Logger getLogger(Class CarController)
    {
        return LoggerFactory.getLogger(CarController);
    }

}

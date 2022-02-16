package com.spacecodee.finance_dashboard.utils;

import java.awt.*;

public class Dimensions {
    private static final Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
    private static final int width = Dimensions.screenSize.width;
    private static final int height = Dimensions.screenSize.height;

    //Size Width
    public static final double size24Width = Dimensions.width / 80.0;
    public static final double size20Width = Dimensions.width / 96.0;
    public static final double size18Width = Dimensions.width / 106.65;

    //Size Height
    public static final double size24Height = Dimensions.width / 45.0;
    public static final double size20Height = Dimensions.width / 54.0;
    public static final double size18Height = Dimensions.width / 60.0;
}

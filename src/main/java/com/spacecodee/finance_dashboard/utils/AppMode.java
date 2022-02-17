package com.spacecodee.finance_dashboard.utils;

import com.spacecodee.finance_dashboard.dto.components.ButtonIconLineDto;

public class AppMode {

    public static ButtonIconLineDto[] sideBarTopLightMode() {
        var btnHome = new ButtonIconLineDto(
                "Home", "home.png", "home_blue.png", false
        );
        var btnCards = new ButtonIconLineDto(
                "Cards", "cards_blue.png", "cards_blue.png", true
        );
        var btnTransactions = new ButtonIconLineDto(
                "Transactions", "transactions.png", "transactions_blue.png", false
        );
        var btnCharts = new ButtonIconLineDto(
                "Charts", "charts.png", "charts_blue.png", false
        );
        var btnCalendar = new ButtonIconLineDto(
                "Calendar", "calendar.png", "calendar_blue.png", false
        );
        var btnReceivers = new ButtonIconLineDto(
                "Receivers", "receivers.png", "receivers_blue.png", false
        );

        return new ButtonIconLineDto[]{
                btnHome, btnCards, btnTransactions, btnCharts, btnCalendar, btnReceivers
        };
    }

    public static ButtonIconLineDto[] sideBarBottomLightMode() {
        var btnLogOut = new ButtonIconLineDto(
                "Log out", "sign-out.png", "sign-out_blue.png", false
        );
        var btnDarkMode = new ButtonIconLineDto(
                "Dark mode", "dark-mode.png", "light_mode.png", false
        );
        var btnSettings = new ButtonIconLineDto(
                "Settings", "settings.png", "settings_blue.png", false
        );

        return new ButtonIconLineDto[]{
                btnSettings, btnDarkMode, btnLogOut
        };
    }
}

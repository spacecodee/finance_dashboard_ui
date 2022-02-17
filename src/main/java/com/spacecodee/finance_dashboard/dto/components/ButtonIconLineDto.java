package com.spacecodee.finance_dashboard.dto.components;

import lombok.*;

@ToString
@AllArgsConstructor
@NoArgsConstructor
public class ButtonIconLineDto {

    @Getter
    @Setter
    private String text;

    @Getter
    @Setter
    private String urlIcon;

    @Getter
    @Setter
    private String urlIconPressed;

    @Getter
    @Setter
    private boolean isPressed;
}

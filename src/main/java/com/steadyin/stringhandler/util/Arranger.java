package com.steadyin.stringhandler.util;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class Arranger {

    private final Separator separator;

    private final Sorter sorter;

    @Getter
    private String sortedEnglish;

    @Getter
    private String sortedNumber;

    public Arranger rearrange(final String str) {
        Separator separate = separator.separate(str);
        this.sortedEnglish = sorter.sort(separator.getEnglish());
        this.sortedNumber = sorter.sort(separator.getNumber());
        return this;
    }
}
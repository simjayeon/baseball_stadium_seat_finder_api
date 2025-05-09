package com.kbo.baseball_stadium_seat_finder_api.domain.enums;

import com.kbo.baseball_stadium_seat_finder_api.domain.entity.StadiumEntity;

public enum StadiumEnum {

    JAMSIL("JAMSIL", "잠실종합운동장 잠실야구장"),
    GOCHUCK("GOCHUCK", "고척스카이돔"),
    DAEJEON("DAEJEON", "대전한화생명볼파크"),
    DAEGU("DAEGU", "대구삼성라이온즈파크"),
    GANGJU("GANGJU", "광주기아챔피언스필드"),
    BUSAN("BUSAN", "부산사직종합운동장 사직야구장"),
    CHANGWON("CHANGWON", "창원NC파크");

    private final String code;
    private final String value;

    StadiumEnum(String code, String value) {
        this.code = code;
        this.value = value;
    }

    public static StadiumEnum from(StadiumEntity entity) {
        for (StadiumEnum stadium : values()) {
            if (stadium.code.equals(entity.getCode())) {
                return stadium;
            }
        }
        throw new IllegalArgumentException("Unknown code: " + entity.getCode());
    }
}

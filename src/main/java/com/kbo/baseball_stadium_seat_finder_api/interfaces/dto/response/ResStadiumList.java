package com.kbo.baseball_stadium_seat_finder_api.interfaces.dto.response;

import com.kbo.baseball_stadium_seat_finder_api.domain.enums.StadiumEnum;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class ResStadiumList {
    private StadiumEnum stadium;
}

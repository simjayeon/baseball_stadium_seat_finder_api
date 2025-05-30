package com.kbo.baseball_stadium_seat_finder_api.interfaces.dto.response;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class ResSeatTypeList {

    @Schema(description = "구장 Enum",
            enumAsRef = true
    )
    private Long id;

    @Schema(description = "구장 Enum",
            enumAsRef = true
    )
    private String seatType;
}

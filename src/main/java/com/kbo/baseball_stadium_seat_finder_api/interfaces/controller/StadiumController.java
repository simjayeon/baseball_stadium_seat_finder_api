package com.kbo.baseball_stadium_seat_finder_api.interfaces.controller;

import com.kbo.baseball_stadium_seat_finder_api.domain.service.StadiumService;
import com.kbo.baseball_stadium_seat_finder_api.interfaces.dto.response.ResSeatTypeList;
import com.kbo.baseball_stadium_seat_finder_api.interfaces.dto.response.ResStadiumList;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/stadium")
@CrossOrigin(origins = "*")
public class StadiumController {
    private final StadiumService stadiumService;

    @Operation(
            operationId = "getStadiumList",
            summary = "구장 리스트 조회",
            responses = {
                    @ApiResponse(responseCode = "200",
                            description = "정상 조회됨",
                            content = @Content(
                            mediaType = "application/json",
                            array = @ArraySchema(schema = @Schema(implementation = ResStadiumList.class))))
            }
    )
    @GetMapping("")
    public List<ResStadiumList> getStadiumList() {
        return stadiumService.getStadiumList();
    }

    @Operation(
            operationId = "getSeatTypeList",
            summary = "구장 좌석 타입 리스트 조회",
            responses = {
                    @ApiResponse(responseCode = "200",
                            description = "정상 조회됨",
                            content = @Content(
                                    mediaType = "application/json",
                                    array = @ArraySchema(schema = @Schema(implementation = ResStadiumList.class))))
            }
    )
    @GetMapping("/seat-type")
    public List<ResSeatTypeList> getSeatTypeList(@RequestParam String stadiumCode) {
        return stadiumService.getSeatTypgetSeatTypeListeList(stadiumCode);
    }
}
package com.kbo.baseball_stadium_seat_finder_api.domain.service;

import com.kbo.baseball_stadium_seat_finder_api.domain.entity.SeatTypeEntity;
import com.kbo.baseball_stadium_seat_finder_api.domain.entity.StadiumEntity;
import com.kbo.baseball_stadium_seat_finder_api.domain.enums.StadiumEnum;
import com.kbo.baseball_stadium_seat_finder_api.domain.repository.ISeatTypeRepository;
import com.kbo.baseball_stadium_seat_finder_api.domain.repository.IStadiumRepository;
import com.kbo.baseball_stadium_seat_finder_api.interfaces.dto.response.ResSeatTypeList;
import com.kbo.baseball_stadium_seat_finder_api.interfaces.dto.response.ResStadiumList;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class StadiumService {

    private final IStadiumRepository stadiumRepository;
    private final ISeatTypeRepository seatTypeRepository;

    public List<ResStadiumList> getStadiumList() {
        List<StadiumEntity> entities = stadiumRepository.findAll();

        if (entities.isEmpty()) {
            return List.of();
        }

        return entities.stream()
                .map(stadium -> new ResStadiumList(StadiumEnum.from(stadium)))
                .toList();
    }

    public List<ResSeatTypeList> getSeatTypgetSeatTypeListeList(String stadiumCode) {
        List<SeatTypeEntity> entities = seatTypeRepository.findAllByStadiumCode(stadiumCode);

        if (entities.isEmpty()) {
            return List.of();
        }

        return entities.stream()
                .map(seatType -> new ResSeatTypeList(seatType.getId(), seatType.getName()))
                .toList();
    }
}

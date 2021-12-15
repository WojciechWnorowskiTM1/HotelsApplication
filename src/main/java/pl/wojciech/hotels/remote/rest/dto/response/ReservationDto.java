package pl.wojciech.hotels.remote.rest.dto.response;

import pl.wojciech.hotels.domain.model.ReservationStatusType;
import pl.wojciech.hotels.remote.rest.dto.request.HotelReservationDto;
import pl.wojciech.hotels.remote.rest.dto.request.PersonReservationDto;

import java.util.List;

public class ReservationDto {
    private Integer id;
    private ReservationStatusType status;
    private PersonReservationDto person;
    private List<HotelReservationDto> hotels;
}

package com.homework2.app.converter;

import com.homework2.app.dto.*;
import com.homework2.app.entity.*;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface AddressMapper {

    AddressMapper INSTANCE = Mappers.getMapper(AddressMapper.class);

    AddressDto convertToAddressDto(Address address);

    List<AddressDto> convertToAddressDtoList(List<Address> addressList);

    Address convertToAddress(AddressSaveRequestDto addressSaveRequestDto);

    Country convertToCountry(CountrySaveRequestDto countrySaveRequestDto);

    CountryDto convertToCountryDto(Country country);

    List<CountryDto> convertToCountryDtoList(List<Country> countryList);

    Province covertToProvince(ProvinceSaveRequestDto provinceSaveRequestDto);

    ProvinceDto convertToProvinceDto(Province province);

    List<ProvinceDto> convertToProvinceDtoList(List<Province> provinceList);

    Town convertToTown(TownSaveRequestDto townSaveRequestDto);

    TownDto convertToTownDto(Town town);

    List<TownDto> convertToTownDtoList(List<Town> townList);

    Neighborhood convertToNeighborhood(NeighborhoodSaveRequestDto neighborhoodSaveRequestDto);

    Neighborhood convertToNeighborhood(NeighborhoodUpdateRequestDto neighborhoodUpdateRequestDto);

    NeighborhoodDto convertToNeighborhoodDto(Neighborhood neighborhood);

    List<NeighborhoodDto> convertToNeighborhoodDtoList(List<Neighborhood> neighborhoodList);

    Street convertToStreet(StreetSaveRequestDto streetSaveRequestDto);

    StreetDto convertToStreetDto(Street street);

    List<StreetDto> convertToStreetDtoList(List<Street> streetList);


}

package wing.support.service;

import lombok.RequiredArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.stereotype.Service;
import wing.support.clients.UserClient;
import wing.support.domain.Support;
import wing.support.domain.SupportRepository;
import wing.support.web.dto.SupportResponseDto;
import wing.support.web.dto.SupportSaveDto;

import java.util.ArrayList;
import java.util.List;

@RequiredArgsConstructor
@Service
public class SupportService {

    private final SupportRepository supportRepository;

    private final UserClient userClient;

    public List<SupportResponseDto> findAll() {
        List<SupportResponseDto> responseDtos = new ArrayList<>();
        List<Support> supportList = supportRepository.findAll();

        for (Support support : supportList) {
            support.withUserName(userClient.getUser(support.getUserId()).getName());
            responseDtos.add(new SupportResponseDto((support)));
        }

        return responseDtos;
    }

    public List<SupportResponseDto> findByArtistId(String id) {
        List<SupportResponseDto> responseDtos = new ArrayList<>();
        List<Support> supportList = supportRepository.findByArtistId(id);

        for (Support support : supportList) {
            support.withUserName(userClient.getUser(support.getUserId()).getName());
            responseDtos.add(new SupportResponseDto((support)));
        }

        return responseDtos;
    }

    public List<SupportResponseDto> findByUserId(String id) {
        List<SupportResponseDto> responseDtos = new ArrayList<>();
        List<Support> supportList = supportRepository.findByUserId(id);

        for (Support support : supportList) {
            support.withUserName(userClient.getUser(id).getName());
            responseDtos.add(new SupportResponseDto((support)));
        }

        return responseDtos;
    }

    public ObjectId save(SupportSaveDto requestDto) {
        return supportRepository.save(requestDto.toEntity()).getId();
    }
}

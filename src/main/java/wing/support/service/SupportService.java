package wing.support.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import wing.support.domain.Support;
import wing.support.domain.SupportRepository;
import wing.support.web.dto.SupportResponseDto;

import java.util.ArrayList;
import java.util.List;

@RequiredArgsConstructor
@Service
public class SupportService {

    private final SupportRepository supportRepository;

    public List<SupportResponseDto> findAll() {
        List<SupportResponseDto> responseDtos = new ArrayList<>();
        List<Support> dataList = supportRepository.findAll();

        for (Support data : dataList) responseDtos.add(new SupportResponseDto((data)));
        return responseDtos;
    }
}

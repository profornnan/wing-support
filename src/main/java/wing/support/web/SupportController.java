package wing.support.web;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import wing.support.service.SupportService;
import wing.support.web.dto.SupportResponseDto;

import java.util.List;

@RestController
@AllArgsConstructor
@CrossOrigin
public class SupportController {

    private final SupportService supportService;

    @GetMapping("/api/support/")
    private List<SupportResponseDto> getSupportList() {
        return supportService.findAll();
    }
}

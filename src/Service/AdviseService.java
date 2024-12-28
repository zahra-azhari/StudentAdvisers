package Service;

import DTO.AdviserDTO;
import Model.Adviser;

import java.util.List;

public interface AdviseService {
    AdviserDTO add(Adviser adviser);
    void delete(String userName);
    AdviserDTO edit(Adviser adviser);
    AdviserDTO get(String userName);
    List<AdviserDTO> getAll();
}

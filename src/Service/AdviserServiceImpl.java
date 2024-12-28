package Service;

import DTO.AdviserDTO;
import model.Adviser;
import Repo.AdviserRepo;
import Repo.AdviserRepoImpl;
import mapper.AdviserMapper;

import java.util.ArrayList;
import java.util.List;

public class AdviserServiceImpl implements AdviseService {
    private final AdviserRepo adviserRepo;
    private final AdviserMapper adviserMapper;

    public AdviserServiceImpl() {
        this.adviserRepo =new AdviserRepoImpl();
        this.adviserMapper = new AdviserMapper();
    }

    @Override
    public AdviserDTO add(Adviser adviser) {
        Adviser result = adviserRepo.save(adviser);
        return adviserMapper.adviserToAdviserDTO(result);
    }

    @Override
    public void delete(String userName) {
        adviserRepo.remove(userName);
    }

    @Override
    public AdviserDTO edit(Adviser adviser) {
        Adviser result = adviserRepo.update(adviser);
        return adviserMapper.adviserToAdviserDTO(result);
    }

    @Override
    public AdviserDTO get(String userName) {
        Adviser result = adviserRepo.get(userName);
        return adviserMapper.adviserToAdviserDTO(result);
    }

    @Override
    public List<AdviserDTO> getAll() {
        List<Adviser> result = adviserRepo.getAll();
        List<AdviserDTO> adviserDTOS = new ArrayList<>();
        for (Adviser adviser : result) {
            adviserDTOS.add(adviserMapper.adviserToAdviserDTO(adviser));
        }
        return adviserDTOS;
    }
}

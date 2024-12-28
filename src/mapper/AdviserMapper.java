package mapper;

import DTO.AdviserDTO;
import model.Adviser;
import model.Student;

public class AdviserMapper {
    public Adviser adviserDtoToAdviser(AdviserDTO adviserDTO){
//        Adviser adviser = new Adviser();
//        adviser.setFirstName(adviserDTO.firstName());
//        adviser.setLastName(adviserDTO.lastName());
//        adviser.setLastName(adviserDTO.lastName());
        return new Adviser(adviserDTO.firstName(), adviserDTO.lastName(), adviserDTO.userName() , null);

    }
    public AdviserDTO adviserToAdviserDTO(Adviser adviser){
        return new AdviserDTO(adviser.getFirstName(),adviser.getLastName(),adviser.getUserName());
    }
}

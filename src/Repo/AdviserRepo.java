package Repo;

import model.Adviser;

import java.util.List;

public interface AdviserRepo {

    Adviser save(Adviser Adviser);
    void remove(String userName);
    Adviser update(Adviser Adviser);
    Adviser get(String userName);
    List<Adviser> getAll();
}

package Repo;

import DB.InMemoryDB;
import Model.Adviser;

import java.util.List;

public class AdviserRepoImpl implements AdviserRepo {

    @Override
    public Adviser save(Adviser Adviser) {
        return InMemoryDB.addAdviser(Adviser);
    }

    @Override
    public void remove(String userName) {
        InMemoryDB.deleteAdviser(userName);
    }

    @Override
    public Adviser update(Adviser Adviser) {
        return InMemoryDB.updateAdviser(Adviser);
    }

    @Override
    public Adviser get(String userName) {
        return InMemoryDB.getAdviser(userName);
    }

    @Override
    public List<Adviser> getAll() {
        return InMemoryDB.getALLAdvisers();
    }
}

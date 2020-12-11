package dao;

import entities.Passport;

public interface PassportDao {

    void save(Passport passport);

    void update(Passport passport);

    Passport getById(int id);

    void delete(Passport passport);
}

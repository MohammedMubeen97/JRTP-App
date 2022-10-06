package in.me.mbn.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import in.me.mbn.entity.Contact;

@Repository
public interface ContactRepository extends JpaRepository<Contact, Integer> {

}

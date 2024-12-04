package com.example.SimpleSpringBatch;

import org.springframework.batch.item.file.mapping.FieldSetMapper;
import org.springframework.batch.item.file.transform.FieldSet;
import org.springframework.validation.BindException;

public class PersonFieldSetMapper implements FieldSetMapper<Person> {
    @Override
    public Person mapFieldSet(FieldSet fieldSet) throws BindException {
        Person person = new Person();
        person.setId(fieldSet.readString("id"));
        person.setName(fieldSet.readString("name"));
        person.setAge(fieldSet.readString("age"));
        return person;
    }
}

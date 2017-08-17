package com.example.demo;

import org.springframework.data.repository.CrudRepository;

/**
 * Created by oracle on 8/16/17.
 */
public interface MessageRepository  extends CrudRepository <Message, Long>{
}

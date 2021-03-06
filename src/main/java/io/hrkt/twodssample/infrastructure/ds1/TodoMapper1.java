package io.hrkt.twodssample.infrastructure.ds1;

import java.util.List;
import org.apache.ibatis.annotations.Select;
import org.springframework.transaction.annotation.Transactional;
import io.hrkt.twodssample.domain.domain.TodoEntry;
import io.hrkt.twodssample.domain.domain1.TodoRepository1;

@Transactional(transactionManager = DataSource1Config.TX_MANAGER_1)
public interface TodoMapper1 extends TodoRepository1 {
  @Override
  @Select("SELECT todo from todos")
  public List<TodoEntry> selectList();

  @Override
  @Select("INSERT INTO todos(todo) VALUES(#{todo})")
  public void save(TodoEntry todoEntry);
}

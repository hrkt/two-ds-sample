package io.hrkt.twodssample.infrastructure.ds2;

import java.util.List;
import org.apache.ibatis.annotations.Select;
import org.springframework.transaction.annotation.Transactional;
import io.hrkt.twodssample.domain.domain.TodoEntry;
import io.hrkt.twodssample.domain.domain2.TodoRepository2;

@Transactional(transactionManager = DataSource2Config.TX_MANAGER_2)
public interface TodoMapper2 extends TodoRepository2 {
  @Override
  @Select("SELECT todo from todos")
  public List<TodoEntry> selectList();

  @Override
  @Select("INSERT INTO todos(todo) VALUES(#{todo})")
  public void save(TodoEntry todoEntry);
}

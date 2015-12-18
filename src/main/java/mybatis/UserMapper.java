package mybatis;

import dao.User;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;

/**
 * Created by huangyazhou on 2015/12/17.
 */
@Repository
public interface UserMapper {
    User selectUserByName(String user_name);
    List<User> selectUser(HashMap<String,Object>user);
    void insertUser(List<User> userList);
    User UserMatch( User user);

}

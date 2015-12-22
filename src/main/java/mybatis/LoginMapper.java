package mybatis;

import dao.Login;
import org.springframework.stereotype.Repository;

/**
 * Created by huangyazhou on 2015/12/17.
 */
public interface LoginMapper {
    void insertLogin (Login login);
}

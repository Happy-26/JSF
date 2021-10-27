package team.niit.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * @Author: HAPPY
 * @Project_name: stu_select_course
 * @Package_name: team.niit.bean
 * @Date: 2021/10/25 23:53
 * explain: 管理员实体类
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "admin")
public class AdminEntity {
    /**
     * 管理员id
     */
    @Id
    private String id;

    /**
     * 管理员姓名
     */
    private String name;

    /**
     * 管理员密码
     */
    private String password;

    /**
     * 管理员手机号码
     */
    private String phone;
}

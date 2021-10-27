package team.niit.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * @Author: HAPPY
 * @Project_name: stu_select_course
 * @Package_name: team.niit.bean
 * @Date: 2021/10/25 23:53
 * explain: 通知实体类
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "notification")
public class NotificationEntity {

    /**
     * 通知编号
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 通知标题
     */
    private String title;

    /**
     * 通知内容
     */
    private String content;

    /**
     * 同时发布时间
     */
    private String time;

    /**
     * 发给的专业
     */
    private String major;
}

package com.wx.movie.data.dao.mapper.user;

import com.wx.movie.data.dao.entity.user.UserAttention;

public interface UserAttentionMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_attention
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_attention
     *
     * @mbggenerated
     */
    int insert(UserAttention record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_attention
     *
     * @mbggenerated
     */
    int insertSelective(UserAttention record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_attention
     *
     * @mbggenerated
     */
    UserAttention selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_attention
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(UserAttention record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_attention
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(UserAttention record);
}
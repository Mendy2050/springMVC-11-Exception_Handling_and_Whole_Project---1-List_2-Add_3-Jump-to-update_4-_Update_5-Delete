package com.itheima.dao;

import com.itheima.domain.Book;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

/**
 * @author Mendy
 * @create 2023-06-29 14:02
 */


public interface BookDao {
    @Insert("insert into ssm_db.tbl_book values(null,#{type},#{name},#{description})")
    public int save(Book book);

    @Update("update ssm_db.tbl_book set type = #{type}, name = #{name}, description = #{description} where id = #{id}")
    public int update(Book book);

    @Delete("delete from ssm_db.tbl_book where id = #{id}")
    public int delete(Integer id);

    @Select("select * from ssm_db.tbl_book where id = #{id}")
    public Book getById(Integer id);

    @Select("select * from ssm_db.tbl_book ")
    public List<Book> getAll();




}

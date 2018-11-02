package com.fashionapp.Repository;

import java.util.List;


import org.springframework.data.repository.CrudRepository;

import com.fashionapp.Entity.FileInfo;

public interface FileInfoRepository extends CrudRepository<FileInfo, Long> {

	List<FileInfo> findByUserid(long id);

	//List<FileInfo> findByUserid(Long id);

}

package org.dshubs.odc.app.service.impl;

import org.dshubs.odc.app.service.FileAbstractService;
import org.dshubs.odc.vo.FileInfoVO;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletResponse;

/**
 * @author Mr.zhou 2022/4/8
 **/
@Service
public class OssFileServiceImpl extends FileAbstractService {

    @Override
    public FileInfoVO upload(MultipartFile file, String bucket, String directory, String fileName) throws Exception {
        return null;
    }

    @Override
    public void download(String bucket, String fileKey, String fileName, HttpServletResponse response) throws Exception {

    }
}
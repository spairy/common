package com.sun.yong.dataservice;

import com.sun.yong.common.entity.model.UserInfo;
import com.sun.yong.common.exception.DateServiceException;

public interface IDataService {

	UserInfo getUserInfo() throws DateServiceException;
}

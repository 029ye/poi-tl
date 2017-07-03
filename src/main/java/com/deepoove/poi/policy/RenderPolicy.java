/*
 * Copyright 2014-2015 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.deepoove.poi.policy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.deepoove.poi.XWPFTemplate;
import com.deepoove.poi.template.ElementTemplate;

public interface RenderPolicy {

	Logger logger = LoggerFactory.getLogger(RenderPolicy.class);

	/**
	 * @param eleTemplate 模板元素
	 * @param data 数据
	 * @param template 持有模板对象
	 */
	void render(ElementTemplate eleTemplate, Object data, XWPFTemplate template);

}

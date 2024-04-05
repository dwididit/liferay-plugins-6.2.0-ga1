/**
 * Copyright (c) 2000-2013 Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.testtransaction.model.impl;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;
import com.liferay.portlet.expando.util.ExpandoBridgeFactoryUtil;

import com.liferay.testtransaction.model.Bar;
import com.liferay.testtransaction.model.BarModel;

import java.io.Serializable;

import java.sql.Types;

import java.util.HashMap;
import java.util.Map;

/**
 * The base model implementation for the Bar service. Represents a row in the &quot;TestTransaction_Bar&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link com.liferay.testtransaction.model.BarModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link BarImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see BarImpl
 * @see com.liferay.testtransaction.model.Bar
 * @see com.liferay.testtransaction.model.BarModel
 * @generated
 */
public class BarModelImpl extends BaseModelImpl<Bar> implements BarModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a bar model instance should use the {@link com.liferay.testtransaction.model.Bar} interface instead.
	 */
	public static final String TABLE_NAME = "TestTransaction_Bar";
	public static final Object[][] TABLE_COLUMNS = {
			{ "barId", Types.BIGINT },
			{ "text_", Types.VARCHAR }
		};
	public static final String TABLE_SQL_CREATE = "create table TestTransaction_Bar (barId LONG not null primary key,text_ VARCHAR(75) null)";
	public static final String TABLE_SQL_DROP = "drop table TestTransaction_Bar";
	public static final String ORDER_BY_JPQL = " ORDER BY bar.text ASC";
	public static final String ORDER_BY_SQL = " ORDER BY TestTransaction_Bar.text_ ASC";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.com.liferay.testtransaction.model.Bar"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.com.liferay.testtransaction.model.Bar"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.column.bitmask.enabled.com.liferay.testtransaction.model.Bar"),
			true);
	public static long TEXT_COLUMN_BITMASK = 1L;
	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.com.liferay.testtransaction.model.Bar"));

	public BarModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _barId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setBarId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _barId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Class<?> getModelClass() {
		return Bar.class;
	}

	@Override
	public String getModelClassName() {
		return Bar.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("barId", getBarId());
		attributes.put("text", getText());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long barId = (Long)attributes.get("barId");

		if (barId != null) {
			setBarId(barId);
		}

		String text = (String)attributes.get("text");

		if (text != null) {
			setText(text);
		}
	}

	@Override
	public long getBarId() {
		return _barId;
	}

	@Override
	public void setBarId(long barId) {
		_barId = barId;
	}

	@Override
	public String getText() {
		if (_text == null) {
			return StringPool.BLANK;
		}
		else {
			return _text;
		}
	}

	@Override
	public void setText(String text) {
		_columnBitmask = -1L;

		if (_originalText == null) {
			_originalText = _text;
		}

		_text = text;
	}

	public String getOriginalText() {
		return GetterUtil.getString(_originalText);
	}

	public long getColumnBitmask() {
		return _columnBitmask;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(0,
			Bar.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public Bar toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (Bar)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		BarImpl barImpl = new BarImpl();

		barImpl.setBarId(getBarId());
		barImpl.setText(getText());

		barImpl.resetOriginalValues();

		return barImpl;
	}

	@Override
	public int compareTo(Bar bar) {
		int value = 0;

		value = getText().compareTo(bar.getText());

		if (value != 0) {
			return value;
		}

		return 0;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof Bar)) {
			return false;
		}

		Bar bar = (Bar)obj;

		long primaryKey = bar.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return (int)getPrimaryKey();
	}

	@Override
	public void resetOriginalValues() {
		BarModelImpl barModelImpl = this;

		barModelImpl._originalText = barModelImpl._text;

		barModelImpl._columnBitmask = 0;
	}

	@Override
	public CacheModel<Bar> toCacheModel() {
		BarCacheModel barCacheModel = new BarCacheModel();

		barCacheModel.barId = getBarId();

		barCacheModel.text = getText();

		String text = barCacheModel.text;

		if ((text != null) && (text.length() == 0)) {
			barCacheModel.text = null;
		}

		return barCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(5);

		sb.append("{barId=");
		sb.append(getBarId());
		sb.append(", text=");
		sb.append(getText());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(10);

		sb.append("<model><model-name>");
		sb.append("com.liferay.testtransaction.model.Bar");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>barId</column-name><column-value><![CDATA[");
		sb.append(getBarId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>text</column-name><column-value><![CDATA[");
		sb.append(getText());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static ClassLoader _classLoader = Bar.class.getClassLoader();
	private static Class<?>[] _escapedModelInterfaces = new Class[] { Bar.class };
	private long _barId;
	private String _text;
	private String _originalText;
	private long _columnBitmask;
	private Bar _escapedModel;
}
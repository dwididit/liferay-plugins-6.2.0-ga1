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

package com.liferay.opensocial.model;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

import java.util.Date;

/**
 * The base model interface for the OAuthConsumer service. Represents a row in the &quot;OpenSocial_OAuthConsumer&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.liferay.opensocial.model.impl.OAuthConsumerModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.liferay.opensocial.model.impl.OAuthConsumerImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see OAuthConsumer
 * @see com.liferay.opensocial.model.impl.OAuthConsumerImpl
 * @see com.liferay.opensocial.model.impl.OAuthConsumerModelImpl
 * @generated
 */
public interface OAuthConsumerModel extends BaseModel<OAuthConsumer> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a o auth consumer model instance should use the {@link OAuthConsumer} interface instead.
	 */

	/**
	 * Returns the primary key of this o auth consumer.
	 *
	 * @return the primary key of this o auth consumer
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this o auth consumer.
	 *
	 * @param primaryKey the primary key of this o auth consumer
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the o auth consumer ID of this o auth consumer.
	 *
	 * @return the o auth consumer ID of this o auth consumer
	 */
	public long getOAuthConsumerId();

	/**
	 * Sets the o auth consumer ID of this o auth consumer.
	 *
	 * @param oAuthConsumerId the o auth consumer ID of this o auth consumer
	 */
	public void setOAuthConsumerId(long oAuthConsumerId);

	/**
	 * Returns the company ID of this o auth consumer.
	 *
	 * @return the company ID of this o auth consumer
	 */
	public long getCompanyId();

	/**
	 * Sets the company ID of this o auth consumer.
	 *
	 * @param companyId the company ID of this o auth consumer
	 */
	public void setCompanyId(long companyId);

	/**
	 * Returns the create date of this o auth consumer.
	 *
	 * @return the create date of this o auth consumer
	 */
	public Date getCreateDate();

	/**
	 * Sets the create date of this o auth consumer.
	 *
	 * @param createDate the create date of this o auth consumer
	 */
	public void setCreateDate(Date createDate);

	/**
	 * Returns the modified date of this o auth consumer.
	 *
	 * @return the modified date of this o auth consumer
	 */
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this o auth consumer.
	 *
	 * @param modifiedDate the modified date of this o auth consumer
	 */
	public void setModifiedDate(Date modifiedDate);

	/**
	 * Returns the gadget key of this o auth consumer.
	 *
	 * @return the gadget key of this o auth consumer
	 */
	@AutoEscape
	public String getGadgetKey();

	/**
	 * Sets the gadget key of this o auth consumer.
	 *
	 * @param gadgetKey the gadget key of this o auth consumer
	 */
	public void setGadgetKey(String gadgetKey);

	/**
	 * Returns the service name of this o auth consumer.
	 *
	 * @return the service name of this o auth consumer
	 */
	@AutoEscape
	public String getServiceName();

	/**
	 * Sets the service name of this o auth consumer.
	 *
	 * @param serviceName the service name of this o auth consumer
	 */
	public void setServiceName(String serviceName);

	/**
	 * Returns the consumer key of this o auth consumer.
	 *
	 * @return the consumer key of this o auth consumer
	 */
	@AutoEscape
	public String getConsumerKey();

	/**
	 * Sets the consumer key of this o auth consumer.
	 *
	 * @param consumerKey the consumer key of this o auth consumer
	 */
	public void setConsumerKey(String consumerKey);

	/**
	 * Returns the consumer secret of this o auth consumer.
	 *
	 * @return the consumer secret of this o auth consumer
	 */
	@AutoEscape
	public String getConsumerSecret();

	/**
	 * Sets the consumer secret of this o auth consumer.
	 *
	 * @param consumerSecret the consumer secret of this o auth consumer
	 */
	public void setConsumerSecret(String consumerSecret);

	/**
	 * Returns the key type of this o auth consumer.
	 *
	 * @return the key type of this o auth consumer
	 */
	@AutoEscape
	public String getKeyType();

	/**
	 * Sets the key type of this o auth consumer.
	 *
	 * @param keyType the key type of this o auth consumer
	 */
	public void setKeyType(String keyType);

	@Override
	public boolean isNew();

	@Override
	public void setNew(boolean n);

	@Override
	public boolean isCachedModel();

	@Override
	public void setCachedModel(boolean cachedModel);

	@Override
	public boolean isEscapedModel();

	@Override
	public Serializable getPrimaryKeyObj();

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj);

	@Override
	public ExpandoBridge getExpandoBridge();

	@Override
	public void setExpandoBridgeAttributes(BaseModel<?> baseModel);

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge);

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext);

	@Override
	public Object clone();

	@Override
	public int compareTo(OAuthConsumer oAuthConsumer);

	@Override
	public int hashCode();

	@Override
	public CacheModel<OAuthConsumer> toCacheModel();

	@Override
	public OAuthConsumer toEscapedModel();

	@Override
	public OAuthConsumer toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}
/*
 * Copyright 2011 JBoss, by Red Hat, Inc
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.jboss.errai.enterprise.jaxrs.server;

import org.jboss.errai.enterprise.jaxrs.client.shared.ContentNegotiationTestService;

/**
 * Implementation of {@link ContentNegotiationTestService} returning test data.
 * 
 * @author Christian Sadilek <csadilek@redhat.com>
 */
public class ContentNegotiationTestServiceImpl implements ContentNegotiationTestService {

  @Override
  public String getText() {
    return "text";
  }

  @Override
  public String getXml() {
    return "xml";
  }

  @Override
  public String postText(String text) {
    return "post:"+text;
  }

  @Override
  public String postXml(String xml) {
    return "post:"+xml;
  }

  @Override
  public String putText(String text) {
    return "put:"+text;
  }

  @Override
  public String putXml(String xml) {
    return "put:"+xml;
  }

  @Override
  public String deleteText(String text) {
    return "delete:text";
  }

  @Override
  public String deleteXml(String xml) {
    return "delete:xml";
  }
}
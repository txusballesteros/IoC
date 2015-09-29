/*
 * Copyright Txus Ballesteros 2015 (@txusballesteros)
 *
 * This file is part of some open source application.
 *
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 *
 * Contact: Txus Ballesteros <txus.ballesteros@gmail.com>
 */
package com.txusballesteros.ioc.di.view;

import com.txusballesteros.ioc.di.domain.Employee;
import com.txusballesteros.ioc.di.model.DemoRepository;
import com.txusballesteros.ioc.di.presenter.DemoPresenter;
import com.txusballesteros.ioc.di.domain.DemoInteractor;

import java.util.List;

public class DemoView {
    private DemoPresenter presenter;

    public DemoView() {
        final DemoRepository repository = new DemoRepository();
        final DemoInteractor interactor = new DemoInteractor(repository);
        presenter = new DemoPresenter(this, interactor);
    }

    public void loadEmployees() {
        presenter.getEmployees();
    }

    public void renderEmployees(List<Employee> employees) {
        //....
    }
}

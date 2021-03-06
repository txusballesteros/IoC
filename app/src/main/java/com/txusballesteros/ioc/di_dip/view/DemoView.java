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
package com.txusballesteros.ioc.di_dip.view;

import com.txusballesteros.ioc.di_dip.domain.DemoInteractor;
import com.txusballesteros.ioc.di_dip.domain.Employee;
import com.txusballesteros.ioc.di_dip.domain.InteractorFactory;
import com.txusballesteros.ioc.di_dip.model.DemoRepository;
import com.txusballesteros.ioc.di_dip.model.RepositoryFactory;
import com.txusballesteros.ioc.di_dip.presenter.DemoPresenter;
import com.txusballesteros.ioc.di_dip.presenter.PresenterFactory;

import java.util.List;

@SuppressWarnings("unused")
public class DemoView implements DemoPresenter.View {
    private DemoPresenter presenter;

    public DemoView() {
        DemoRepository repository = RepositoryFactory.getInstance().getDemoRepository();
        DemoInteractor interactor = InteractorFactory.getInstance().getDemoInteractor(repository);
        presenter = PresenterFactory.getInstance().getDemoPresenter(this, interactor);
    }

    public void onShowList() {
        presenter.onShowList();
    }

    @Override
    public void renderList(List<Employee> employees) {
        //....
    }
}

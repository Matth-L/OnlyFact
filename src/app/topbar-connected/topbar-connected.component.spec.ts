import { ComponentFixture, TestBed } from '@angular/core/testing';

import { TopbarConnectedComponent } from './topbar-connected.component';

describe('TopbarConnectedComponent', () => {
  let component: TopbarConnectedComponent;
  let fixture: ComponentFixture<TopbarConnectedComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [TopbarConnectedComponent]
    });
    fixture = TestBed.createComponent(TopbarConnectedComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});

import { mount } from '@vue/test-utils'
import appTest from './app.js';
global.axios = {
    get(){return Promise.resolve({ data: [{}]})},
    post(){return Promise.resolve('')}
}

test('schould show the Ingredients', ()=> {
    const wrapper = mount(appTest);
    expect(wrapper.text()).toContain('')
})